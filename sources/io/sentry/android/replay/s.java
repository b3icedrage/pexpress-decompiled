package io.sentry.android.replay;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import defpackage.C1589Ne;
import io.sentry.util.C4527a;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class s implements Closeable {

    @NotNull
    public final AtomicBoolean d = new AtomicBoolean(false);

    @NotNull
    public final C4527a e = new C4527a();

    @NotNull
    public final b g = new b();

    @NotNull
    public final a h = new a();

    public static final class b extends CopyOnWriteArrayList<f> {
        public b() {
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
        public final boolean add(Object obj) {
            f fVar = (f) obj;
            s sVar = s.this;
            C4527a.C0404a c0404aA = sVar.e.a();
            try {
                for (View view : sVar.h) {
                    if (fVar != null) {
                        fVar.c(view, true);
                    }
                }
                Unit unit = Unit.a;
                c0404aA.close();
                return super.add(fVar);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    C1589Ne.l(c0404aA, th);
                    throw th2;
                }
            }
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof f) {
                return super.contains((f) obj);
            }
            return false;
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj == null ? true : obj instanceof f) {
                return super.indexOf((f) obj);
            }
            return -1;
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj == null ? true : obj instanceof f) {
                return super.lastIndexOf((f) obj);
            }
            return -1;
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
        public final /* bridge */ boolean remove(Object obj) {
            if (obj == null ? true : obj instanceof f) {
                return super.remove((f) obj);
            }
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.set(true);
        this.g.clear();
    }

    public static final class a extends ArrayList<View> {
        public a() {
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean add(Object obj) {
            View element = (View) obj;
            Intrinsics.checkNotNullParameter(element, "element");
            Iterator<f> it = s.this.g.iterator();
            while (it.hasNext()) {
                it.next().c(element, true);
            }
            return super.add(element);
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean addAll(Collection<? extends View> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            for (f fVar : s.this.g) {
                Iterator<T> it = elements.iterator();
                while (it.hasNext()) {
                    fVar.c((View) it.next(), true);
                }
            }
            return super.addAll(elements);
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof View) {
                return super.contains((View) obj);
            }
            return false;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof View) {
                return super.indexOf((View) obj);
            }
            return -1;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof View) {
                return super.lastIndexOf((View) obj);
            }
            return -1;
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean remove(Object obj) {
            if (obj instanceof View) {
                return super.remove((View) obj);
            }
            return false;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final Object remove(int i) {
            Object objRemove = super.remove(i);
            Intrinsics.checkNotNullExpressionValue(objRemove, "removeAt(...)");
            View view = (View) objRemove;
            Iterator<f> it = s.this.g.iterator();
            while (it.hasNext()) {
                it.next().c(view, false);
            }
            return view;
        }
    }
}
