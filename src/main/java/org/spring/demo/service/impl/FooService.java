package org.spring.demo.service.impl;

import org.spring.demo.bean.Foo;
import org.spring.demo.service.IFooService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class FooService implements IFooService {

    Random idSeq = new Random();

    @Override
    public Long create(Foo f) {
        if (f.getId() == null) {
            f.setId(idSeq.nextLong());
        }
        return f.getId();
    }

    @Override
    public List<Foo> findAll() {
        int num = 10;
        List<Foo> all = new ArrayList<>(num);
        for (int i=0; i<num; i++) {
            Foo foo = new Foo();
            foo.setId(Long.valueOf(i));
            foo.setName("name_" + i);
            all.add(foo);
        }
        return all;
    }

    @Override
    public Foo findOne(Long id) {
        Foo foo = new Foo();
        foo.setId(id);
        return foo;
    }

    @Override
    public Foo getById(Long id) {
        Foo foo = new Foo();
        foo.setId(id);
        return foo;
    }

    @Override
    public void update(Foo f) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
