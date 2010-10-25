/*
 * Created on Oct 23, 2010
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright @2010 the original author or authors.
 */
package org.fest.assertions.data;

import static junit.framework.Assert.assertSame;

import org.junit.Test;

/**
 * Tests for <code>{@link Offset#offset(Float)}</code>.
 *
 * @author Alex Ruiz
 */
public class Offset_offset_with_Float_Test {

  @Test public void should_create_Offset() {
    Float value = 0.8f;
    Offset<Float> offset = Offset.offset(value);
    assertSame(value, offset.value());
  }
}