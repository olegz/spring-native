/*
 * Copyright 2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.stereotype;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.nativex.extension.NativeImageHint;
import org.springframework.nativex.extension.NativeImageConfiguration;
import org.springframework.nativex.extension.TypeInfo;
import org.springframework.nativex.type.AccessBits;

@NativeImageHint(typeInfos = {
	@TypeInfo(types= {Component.class,PostConstruct.class, Resource.class},access=AccessBits.CLASS|AccessBits.DECLARED_METHODS)
})
public class ComponentHints implements NativeImageConfiguration {
}