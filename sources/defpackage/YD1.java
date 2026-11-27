package defpackage;

import com.api.feature.navigation.adder.SimpleFragmentInflate;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface YD1 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a d;
        public static final a e;
        public static final a g;
        public static final a h;
        public static final /* synthetic */ a[] i;

        static {
            a aVar = new a("ACTIVATION", 0);
            d = aVar;
            a aVar2 = new a("ROBOT", 1);
            e = aVar2;
            a aVar3 = new a("ACCOUNT", 2);
            g = aVar3;
            a aVar4 = new a("SUPPORT", 3);
            h = aVar4;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
            i = aVarArr;
            C1952Ru.i(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) i.clone();
        }
    }

    @NotNull
    SimpleFragmentInflate<?, ?> a();

    @NotNull
    SimpleFragmentInflate<?, ?> b();

    @NotNull
    SimpleFragmentInflate<?, ?> c();

    @NotNull
    SimpleFragmentInflate<?, ?> d();

    @NotNull
    SimpleFragmentInflate<?, ?> e();

    @NotNull
    SimpleFragmentInflate<?, ?> f();

    @NotNull
    SimpleFragmentInflate<?, ?> g();

    @NotNull
    SimpleFragmentInflate<?, ?> h();

    @NotNull
    SimpleFragmentInflate<?, ?> i();

    @NotNull
    SimpleFragmentInflate<?, ?> j();

    @NotNull
    SimpleFragmentInflate<?, ?> k();

    @NotNull
    SimpleFragmentInflate<?, ?> l();

    @NotNull
    SimpleFragmentInflate<?, ?> m();

    @NotNull
    SimpleFragmentInflate<?, ?> n();

    void o(@NotNull a aVar);

    @NotNull
    SimpleFragmentInflate<?, ?> p();

    @NotNull
    SimpleFragmentInflate<?, ?> q();

    @NotNull
    SimpleFragmentInflate<?, ?> r();

    @NotNull
    SimpleFragmentInflate<?, ?> s();

    @NotNull
    SimpleFragmentInflate<?, ?> t();

    @NotNull
    SimpleFragmentInflate<?, ?> u();

    @NotNull
    SimpleFragmentInflate<?, ?> v();

    @NotNull
    SimpleFragmentInflate<?, ?> w();

    @NotNull
    SimpleFragmentInflate<?, ?> x();
}
