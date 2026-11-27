package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Xa0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC2391Xa0 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: Xa0$a */
    public static final class a {
        public static final a d;
        public static final a e;
        public static final a g;
        public static final /* synthetic */ a[] h;

        static {
            a aVar = new a("CONFLICTS_ONLY", 0);
            d = aVar;
            a aVar2 = new a("SUCCESS_ONLY", 1);
            e = aVar2;
            a aVar3 = new a("BOTH", 2);
            g = aVar3;
            h = new a[]{aVar, aVar2, aVar3};
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: Xa0$b */
    public static final class b {
        public static final b d;
        public static final b e;
        public static final b g;
        public static final /* synthetic */ b[] h;

        static {
            b bVar = new b("OVERRIDABLE", 0);
            d = bVar;
            b bVar2 = new b("INCOMPATIBLE", 1);
            e = bVar2;
            b bVar3 = new b("UNKNOWN", 2);
            g = bVar3;
            h = new b[]{bVar, bVar2, bVar3};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) h.clone();
        }
    }

    @NotNull
    a a();

    @NotNull
    b b(@NotNull InterfaceC1335Jx interfaceC1335Jx, @NotNull InterfaceC1335Jx interfaceC1335Jx2, @Nullable FC fc);
}
