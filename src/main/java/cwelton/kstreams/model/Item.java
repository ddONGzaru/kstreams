/*
 * Copyright 2016 Caleb Welton
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cwelton.kstreams.model;

/**
 * Created by cwelton on 8/24/16.
 */
public class Item {
    private String name;

    public Item(String name) {
        this.name = name;
    }

    private Item(Builder builder) {
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static final class Builder {
        private String name;

        private Builder() {
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Item build() {
            return new Item(this);
        }
    }
}
