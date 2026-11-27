package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface DS0 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a d;
        public static final a e;
        public static final a g;
        public static final a h;
        public static final /* synthetic */ a[] i;

        static {
            a aVar = new a("DEBUG", 0);
            d = aVar;
            a aVar2 = new a("INFO", 1);
            e = aVar2;
            a aVar3 = new a("WARN", 2);
            g = aVar3;
            a aVar4 = new a("ERROR", 3);
            h = aVar4;
            i = new a[]{aVar, aVar2, aVar3, aVar4, new a("OFF", 4)};
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

    void a(@NotNull String str);

    void error(@NotNull String str);

    void info(@NotNull String str);

    void warn(@NotNull String str);
}
