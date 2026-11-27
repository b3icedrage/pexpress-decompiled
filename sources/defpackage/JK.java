package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class JK<T> implements LK<T> {

    @NotNull
    public final NK<T> a;

    @NotNull
    public final ArrayList b;

    @NotNull
    public final ArrayList c;

    @Nullable
    public T d;

    @Nullable
    public Tj2 e;

    public JK(@NotNull NK<T> tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.a = tracker;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    @Override // defpackage.LK
    public final void a(T t) {
        this.d = t;
        e(this.e, t);
    }

    public abstract boolean b(@NotNull Bk2 bk2);

    public abstract boolean c(T t);

    public final void d(@NotNull Collection workSpecs) {
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
        this.b.clear();
        this.c.clear();
        ArrayList arrayList = this.b;
        for (T t : workSpecs) {
            if (b((Bk2) t)) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = this.b;
        ArrayList arrayList3 = this.c;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((Bk2) it.next()).a);
        }
        if (this.b.isEmpty()) {
            this.a.b(this);
        } else {
            NK<T> nk = this.a;
            nk.getClass();
            Intrinsics.checkNotNullParameter(this, "listener");
            synchronized (nk.c) {
                try {
                    if (nk.d.add(this)) {
                        if (nk.d.size() == 1) {
                            nk.e = nk.a();
                            AS0 as0C = AS0.c();
                            int i = OK.a;
                            Objects.toString(nk.e);
                            as0C.getClass();
                            nk.d();
                        }
                        a(nk.e);
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        e(this.e, this.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(Tj2 tj2, Object obj) {
        ArrayList workSpecs = this.b;
        if (workSpecs.isEmpty() || tj2 == null) {
            return;
        }
        if (obj == 0 || c(obj)) {
            Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
            synchronized (tj2.c) {
                Sj2 sj2 = tj2.a;
                if (sj2 != null) {
                    sj2.d(workSpecs);
                    Unit unit = Unit.a;
                }
            }
            return;
        }
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
        synchronized (tj2.c) {
            try {
                ArrayList<Bk2> arrayList = new ArrayList();
                for (Object obj2 : workSpecs) {
                    if (tj2.a(((Bk2) obj2).a)) {
                        arrayList.add(obj2);
                    }
                }
                for (Bk2 bk2 : arrayList) {
                    AS0 as0C = AS0.c();
                    int i = Uj2.a;
                    Objects.toString(bk2);
                    as0C.getClass();
                }
                Sj2 sj3 = tj2.a;
                if (sj3 != null) {
                    sj3.f(arrayList);
                    Unit unit2 = Unit.a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
