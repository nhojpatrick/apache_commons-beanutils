/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.beanutils2.converters;

/**
 * {@link NumberConverter} implementation that handles conversion to and from <strong>java.lang.Float</strong> objects.
 * <p>
 * This implementation can be configured to handle conversion either by using Float's default String conversion, or by using a Locale's pattern or by specifying
 * a format pattern. See the {@link NumberConverter} documentation for further details.
 * <p>
 * Can be configured to either return a <em>default value</em> or throw a {@code ConversionException} if a conversion error occurs.
 *
 * @since 1.3
 */
public final class FloatConverter extends NumberConverter<Float> {

    /**
     * Constructs a <strong>java.lang.Float</strong> <em>Converter</em> that throws a {@code ConversionException} if an error occurs.
     */
    public FloatConverter() {
        super(true);
    }

    /**
     * Constructs a <strong>java.lang.Float</strong> <em>Converter</em> that returns a default value if an error occurs.
     *
     * @param defaultValue The default value to be returned if the value to be converted is missing or an error occurs converting the value.
     */
    public FloatConverter(final Float defaultValue) {
        super(true, defaultValue);
    }

    /**
     * Constructs a <strong>java.lang.Float</strong> <em>Converter</em> that returns a default value if an error occurs.
     *
     * @param defaultValue The default value to be returned if the value to be converted is missing or an error occurs converting the value.
     */
    public FloatConverter(final Number defaultValue) {
        this(defaultValue.floatValue());
    }

    /**
     * Gets the default type this {@code Converter} handles.
     *
     * @return The default type this {@code Converter} handles.
     * @since 1.8.0
     */
    @Override
    protected Class<Float> getDefaultType() {
        return Float.class;
    }

}
