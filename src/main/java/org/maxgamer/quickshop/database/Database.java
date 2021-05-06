/*
 * This file is a part of project QuickShop, the name is Database.java
 *  Copyright (C) PotatoCraft Studio and contributors
 *
 *  This program is free software: you can redistribute it and/or modify it
 *  under the terms of the GNU General Public License as published by the
 *  Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful, but WITHOUT
 *  ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 *  FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 *  for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program. If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.maxgamer.quickshop.database;

import org.jetbrains.annotations.NotNull;
import org.maxgamer.quickshop.shop.Shop;
import org.maxgamer.quickshop.shop.ShopLoader;

import java.util.List;
import java.util.UUID;

public interface Database {
    void cleanMessage(long weekAgo);

    void cleanMessageForPlayer(@NotNull UUID player);

    void createShop(@NotNull Shop shop);

    void removeShop(@NotNull Shop shop);

    void removeShop(@NotNull String world, int x, int y, int z);

    void removeShop(@NotNull ShopLoader.ShopDatabaseInfoOrigin shop);

    void removeShop(@NotNull ShopLoader.ShopDatabaseInfo shop);

    List<Message> selectAllMessages();

    List<ShopLoader.ShopDatabaseInfoOrigin> selectAllShops();

    List<ShopLoader.ShopDatabaseInfoOrigin> selectShops(@NotNull String world);

    void sendMessage(@NotNull UUID player, @NotNull String message, long time);

    void updateOwner2UUID(@NotNull String ownerUUID, int x, int y, int z, @NotNull String worldName);

    void updateShop(@NotNull Shop shop);

    class Message {
    }
}
