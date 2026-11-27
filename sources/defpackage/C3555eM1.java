package defpackage;

import androidx.recyclerview.widget.p;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: eM1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3555eM1<T> extends E7<T> {

    @NotNull
    public final a e;

    @NotNull
    public List<? extends F7<T>> f;

    /* JADX INFO: renamed from: eM1$a */
    public static final class a<T> {
    }

    /* JADX INFO: renamed from: eM1$b */
    public static final class b<T> extends p.b {

        @NotNull
        public final List<F7<T>> a;

        @NotNull
        public final List<F7<T>> b;

        @NotNull
        public final a c;

        public b(@NotNull List newList, @NotNull List oldList, @NotNull a comparator) {
            Intrinsics.checkNotNullParameter(newList, "newList");
            Intrinsics.checkNotNullParameter(oldList, "oldList");
            Intrinsics.checkNotNullParameter(comparator, "comparator");
            this.a = newList;
            this.b = oldList;
            this.c = comparator;
        }

        @Override // androidx.recyclerview.widget.p.b
        public final boolean a(int i, int i2) {
            F7<T> f7 = this.b.get(i);
            F7<T> f8 = this.a.get(i2);
            this.c.getClass();
            F7<T> left = f7;
            F7<T> right = f8;
            Intrinsics.checkNotNullParameter(left, "left");
            Intrinsics.checkNotNullParameter(right, "right");
            return Intrinsics.a(left.b, right.b);
        }

        @Override // androidx.recyclerview.widget.p.b
        public final boolean b(int i, int i2) {
            F7<T> f7 = this.b.get(i);
            F7<T> f8 = this.a.get(i2);
            this.c.getClass();
            F7<T> left = f7;
            F7<T> right = f8;
            Intrinsics.checkNotNullParameter(left, "left");
            Intrinsics.checkNotNullParameter(right, "right");
            return left.a == right.a;
        }

        @Override // androidx.recyclerview.widget.p.b
        public final int d() {
            return this.a.size();
        }

        @Override // androidx.recyclerview.widget.p.b
        public final int e() {
            return this.b.size();
        }
    }

    public C3555eM1() {
        this(null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int c() {
        return this.f.size();
    }

    public C3555eM1(Object obj) {
        a comparator = new a();
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        this.e = comparator;
        List<? extends F7<T>> list = Collections.EMPTY_LIST;
        Intrinsics.checkNotNullExpressionValue(list, "emptyList()");
        this.f = list;
    }
}
