package io.sentry.android.core.internal.threaddump;

import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    @NotNull
    public final ArrayList<? extends a> a;
    public final int b;
    public int c;

    public b(@NotNull ArrayList<? extends a> arrayList) {
        this.a = arrayList;
        this.b = arrayList.size();
    }

    @Nullable
    public final a a() {
        int i = this.c;
        if (i < 0 || i >= this.b) {
            return null;
        }
        this.c = i + 1;
        return this.a.get(i);
    }
}
