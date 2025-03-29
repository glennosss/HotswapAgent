/*
 * Copyright 2013-2025 the HotswapAgent authors.
 *
 * This file is part of HotswapAgent.
 *
 * HotswapAgent is free software: you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the
 * Free Software Foundation, either version 2 of the License, or (at your
 * option) any later version.
 *
 * HotswapAgent is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General
 * Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with HotswapAgent. If not, see http://www.gnu.org/licenses/.
 */
package org.hotswap.agent.plugin.spring.testBeans;

public class BeanServiceNoAutowireImpl implements BeanService {
    BeanRepository beanRepository;

    @Override
    public String hello() {
        return beanRepository.hello() + " Service";
    }

    public void setBeanRepository(BeanRepository beanRepository) {
        this.beanRepository = beanRepository;
    }

    @Override
    public String isInjectFieldInjected() {
        return "no";
    }
}
