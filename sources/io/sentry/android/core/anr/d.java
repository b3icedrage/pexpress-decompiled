package io.sentry.android.core.anr;

import defpackage.C1742Pc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class d {
    public final ArrayList a;
    public final long b;
    public final long c;

    public d(@NotNull List<g> list) {
        this.a = new ArrayList(list.size());
        for (g gVar : list) {
            if (gVar != null) {
                this.a.add(gVar);
            }
        }
        Collections.sort(this.a);
        if (this.a.isEmpty()) {
            this.b = 0L;
            this.c = 0L;
        } else {
            this.b = ((g) this.a.get(0)).e;
            this.c = ((g) C1742Pc.c(1, this.a)).e + 10000;
        }
    }
}
