package com.example.TermProjectTest.AdvancedSearch;

import com.example.TermProjectTest.Construction.Construction;
import com.example.TermProjectTest.Construction.ConstructionRepository;
import com.example.TermProjectTest.Floors.FloorsRepository;
import com.example.TermProjectTest.Fossils.FossilsRepository;
import com.example.TermProjectTest.GenericRepository;
import com.example.TermProjectTest.GenericTable;
import com.example.TermProjectTest.Headwear.HeadwearRepository;
import com.example.TermProjectTest.Music.MusicRepository;
import com.example.TermProjectTest.Reactions.ReactionsRepository;
import com.example.TermProjectTest.Villagers.VillagersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class AdvancedSearchService {

    @Autowired
    public GenericRepository<Construction> constructionRepository;
    @Autowired
    public FloorsRepository floorsRepository;
    @Autowired
    public FossilsRepository fossilsRepository;
    @Autowired
    public MusicRepository musicRepository;
    @Autowired
    public HeadwearRepository headwearRepository;
    @Autowired
    public ReactionsRepository reactionsRepository;
    @Autowired
    public VillagersRepository villagersRepository;

    public GenericRepository<? extends GenericTable> findRepo(String repo) {
        switch (repo) {
            case "Construction":
                return constructionRepository;
            case "Floors":
                return floorsRepository;
            case "Fossils":
                return fossilsRepository;
            case "Headwear":
                return headwearRepository;
            case "Music":
                return musicRepository;
            case "Reactions":
                return reactionsRepository;
            default:
                return villagersRepository;
        }
    }

    public static <T extends GenericTable> Predicate<T> includesSearch(Method getAttribute, String include) {
        return p -> {
            try {
                String attribute =  getAttribute.invoke(p).toString();
                attribute = attribute.toLowerCase();
                return attribute.contains(include);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            return false;
        };
    }

    public static <T extends GenericTable> Predicate<T> exactSearch(Method getAttribute, String exact) {
        return p -> {
            try {
                String attribute =  getAttribute.invoke(p).toString();
                return attribute.equalsIgnoreCase(exact);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            return false;
        };
    }

    public static <T extends GenericTable> Predicate<T> excludeSearch(Method getAttribute, String exclude) {
        return p -> {
            try {
                String attribute =  getAttribute.invoke(p).toString();
                attribute = attribute.toLowerCase();
                return !attribute.contains(exclude);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            return false;
        };
    }

    public static <T> Method getMethod(T result, String attribute) {
        attribute = attribute.substring(0, 1).toUpperCase() + attribute.substring(1);
        String methodName = "get" + attribute;
        Method getAttribute = null;
        try {
            getAttribute = result.getClass().getMethod(methodName);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return getAttribute;
    }

    public <T extends GenericTable> List<T> findIncluding(List<T> result, String include, String attribute) {
        include = include.toLowerCase();
        Method getAttribute = getMethod(result.get(0), attribute);
        result = result.stream().filter(includesSearch(getAttribute, include)).collect(Collectors.toList());
        return result;
    }

    public <T extends GenericTable> List<T> findExact(List<T> result, String exact, String attribute) {
        Method getAttribute = getMethod(result.get(0), attribute);
        result = result.stream().filter(exactSearch(getAttribute, exact)).collect(Collectors.toList());
        return result;
    }

    public <T extends GenericTable> List<T> findExcluding(List<T> result, String exclude, String attribute) {
        exclude = exclude.toLowerCase();
        Method getAttribute = getMethod(result.get(0), attribute);
        result = result.stream().filter(excludeSearch(getAttribute, exclude)).collect(Collectors.toList());
        return result;
    }
}
