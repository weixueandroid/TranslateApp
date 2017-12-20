/*
 *  Copyright (C) 2015 GuDong <gudong.name@gmail.com>
 *
 *  This file is part of GdTranslate
 *
 *  GdTranslate is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  GdTranslate is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with GdTranslate.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package name.gudong.translate.mvp.model.type;

/**
 * Created by GuDong on 2/22/16 21:41.
 * Contact with gudong.name@gmail.com.
 */
public enum EDurationTipTime {
    ONE_SECOND(0,2),
    THREE_SECOND(1,3),
    FOUR_SECOND(2,4),
    SIX_SECOND(3,6),
    TEN_SECOND(4,10);

    private int mIndex;
    private int mDurationTime;

    EDurationTipTime(int index,int time) {
        this.mIndex = index;
        this.mDurationTime = time;
    }

    public int getDurationTime() {
        return mDurationTime;
    }
    public int getIndex() {
        return mIndex;
    }
}
