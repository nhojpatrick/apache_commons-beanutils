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

import java.time.OffsetTime;

/**
 * {@link org.apache.commons.beanutils2.Converter} implementation that handles conversion to and from <strong>java.time.OffsetTime</strong> objects.
 * <p>
 * Can be configured to either return a <em>default value</em> or throw a {@code ConversionException} if a conversion error occurs.
 * </p>
 *
 * @since 2.0
 * @see java.time.OffsetTime
 */
public final class OffsetTimeConverter extends AbstractConverter<OffsetTime> {

    /**
     * Constructs a <strong>java.time.OffsetTime</strong> <em>Converter</em> that throws a {@code ConversionException} if an error occurs.
     */
    public OffsetTimeConverter() {
    }

    /**
     * Constructs a <strong>java.time.OffsetTime</strong> <em>Converter</em> that returns a default value if an error occurs.
     *
     * @param defaultValue The default value to be returned if the value to be converted is missing or an error occurs converting the value.
     */
    public OffsetTimeConverter(final OffsetTime defaultValue) {
        super(defaultValue);
    }

    /**
     * <p>
     * Converts a java.time.OffsetTime or object into a String.
     * </p>
     *
     * @param <T>   Target type of the conversion.
     * @param type  Data type to which this value should be converted.
     * @param value The input value to be converted.
     * @return The converted value.
     * @throws Throwable if an error occurs converting to the specified type
     * @since 2.0
     */
    @Override
    protected <T> T convertToType(final Class<T> type, final Object value) throws Throwable {
        if (OffsetTime.class.equals(type)) {
            return type.cast(OffsetTime.parse(String.valueOf(value)));
        }

        throw conversionException(type, value);
    }

    /**
     * Gets the default type this {@code Converter} handles.
     *
     * @return The default type this {@code Converter} handles.
     * @since 2.0
     */
    @Override
    protected Class<OffsetTime> getDefaultType() {
        return OffsetTime.class;
    }

}
