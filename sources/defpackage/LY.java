package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class LY {

    @NotNull
    public static final a c = new a();
    public static final int d;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;

    @NotNull
    public static final LY m;

    @NotNull
    public static final LY n;

    @NotNull
    public static final LY o;

    @NotNull
    public static final LY p;

    @NotNull
    public static final LY q;

    @NotNull
    public static final ArrayList r;

    @NotNull
    public static final ArrayList s;

    @NotNull
    public final List<KY> a;
    public final int b;

    public static final class a {

        /* JADX INFO: renamed from: LY$a$a, reason: collision with other inner class name */
        public static final class C0085a {
            public final int a;

            @NotNull
            public final String b;

            public C0085a(int i, @NotNull String name) {
                Intrinsics.checkNotNullParameter(name, "name");
                this.a = i;
                this.b = name;
            }
        }
    }

    static {
        a.C0085a c0085a;
        int i2 = d;
        int i3 = i2 << 1;
        e = i2;
        int i4 = i2 << 2;
        f = i3;
        int i5 = i2 << 3;
        g = i4;
        int i6 = i2 << 4;
        h = i5;
        int i7 = i2 << 5;
        i = i6;
        j = i7;
        d = i2 << 7;
        int i8 = (i2 << 6) - 1;
        k = i8;
        int i9 = i2 | i3 | i4;
        l = i9;
        m = new LY(i8);
        n = new LY(i6 | i7);
        new LY(i2);
        new LY(i3);
        new LY(i4);
        o = new LY(i9);
        new LY(i5);
        p = new LY(i6);
        q = new LY(i7);
        new LY(i3 | i6 | i7);
        Field[] fields = LY.class.getFields();
        Intrinsics.checkNotNullExpressionValue(fields, "getFields(...)");
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            a.C0085a c0085a2 = null;
            if (!it.hasNext()) {
                break;
            }
            Field field2 = (Field) it.next();
            Object obj = field2.get(null);
            LY ly = obj instanceof LY ? (LY) obj : null;
            if (ly != null) {
                String name = field2.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                c0085a2 = new a.C0085a(ly.b, name);
            }
            if (c0085a2 != null) {
                arrayList2.add(c0085a2);
            }
        }
        r = arrayList2;
        Field[] fields2 = LY.class.getFields();
        Intrinsics.checkNotNullExpressionValue(fields2, "getFields(...)");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (Intrinsics.a(((Field) obj2).getType(), Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj3 = field4.get(null);
            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj3).intValue();
            if (iIntValue == ((-iIntValue) & iIntValue)) {
                String name2 = field4.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                c0085a = new a.C0085a(iIntValue, name2);
            } else {
                c0085a = null;
            }
            if (c0085a != null) {
                arrayList5.add(c0085a);
            }
        }
        s = arrayList5;
    }

    public LY(int i2) {
        this(i2, C5653o60.d);
    }

    public final boolean a(int i2) {
        return (i2 & this.b) != 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!LY.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.c(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        LY ly = (LY) obj;
        return Intrinsics.a(this.a, ly.a) && this.b == ly.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    @NotNull
    public final String toString() {
        Object next;
        Iterator it = r.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((a.C0085a) next).a != this.b);
        a.C0085a c0085a = (a.C0085a) next;
        String strJ = c0085a != null ? c0085a.b : null;
        if (strJ == null) {
            ArrayList<a.C0085a> arrayList = s;
            ArrayList arrayList2 = new ArrayList();
            for (a.C0085a c0085a2 : arrayList) {
                String str = a(c0085a2.a) ? c0085a2.b : null;
                if (str != null) {
                    arrayList2.add(str);
                }
            }
            strJ = CollectionsKt.J(arrayList2, " | ", null, null, null, 62);
        }
        StringBuilder sbB = C6495s7.b("DescriptorKindFilter(", strJ, ", ");
        sbB.append(this.a);
        sbB.append(')');
        return sbB.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LY(int i2, @NotNull List<? extends KY> excludes) {
        Intrinsics.checkNotNullParameter(excludes, "excludes");
        this.a = excludes;
        Iterator it = excludes.iterator();
        while (it.hasNext()) {
            i2 &= ~((KY) it.next()).a();
        }
        this.b = i2;
    }
}
