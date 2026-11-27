package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface GJ0 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a d;
        public static final a e;
        public static final a g;
        public static final /* synthetic */ a[] h;

        static {
            a aVar = new a("INSTANCE", 0);
            d = aVar;
            a aVar2 = new a("EXTENSION_RECEIVER", 1);
            e = aVar2;
            a aVar3 = new a("VALUE", 2);
            g = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            h = aVarArr;
            C1952Ru.i(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) h.clone();
        }
    }

    boolean e();

    @Nullable
    String getName();

    @NotNull
    WJ0 getType();

    @NotNull
    a h();

    int l();

    boolean m();
}
