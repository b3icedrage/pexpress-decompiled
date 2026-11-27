package androidx.lifecycle;

import defpackage.EP0;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    @NotNull
    public final AtomicReference<Object> a = new AtomicReference<>();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;

        @NotNull
        public static final C0236a Companion;
        public static final a ON_ANY;
        public static final a ON_CREATE;
        public static final a ON_DESTROY;
        public static final a ON_PAUSE;
        public static final a ON_RESUME;
        public static final a ON_START;
        public static final a ON_STOP;

        /* JADX INFO: renamed from: androidx.lifecycle.g$a$a, reason: collision with other inner class name */
        public static final class C0236a {
            @Nullable
            public static a a(@NotNull b state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int iOrdinal = state.ordinal();
                if (iOrdinal == 2) {
                    return a.ON_DESTROY;
                }
                if (iOrdinal == 3) {
                    return a.ON_STOP;
                }
                if (iOrdinal != 4) {
                    return null;
                }
                return a.ON_PAUSE;
            }

            @Nullable
            public static a b(@NotNull b state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int iOrdinal = state.ordinal();
                if (iOrdinal == 2) {
                    return a.ON_CREATE;
                }
                if (iOrdinal == 3) {
                    return a.ON_START;
                }
                if (iOrdinal != 4) {
                    return null;
                }
                return a.ON_RESUME;
            }
        }

        public /* synthetic */ class b {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[a.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                a = iArr;
            }
        }

        static {
            a aVar = new a("ON_CREATE", 0);
            ON_CREATE = aVar;
            a aVar2 = new a("ON_START", 1);
            ON_START = aVar2;
            a aVar3 = new a("ON_RESUME", 2);
            ON_RESUME = aVar3;
            a aVar4 = new a("ON_PAUSE", 3);
            ON_PAUSE = aVar4;
            a aVar5 = new a("ON_STOP", 4);
            ON_STOP = aVar5;
            a aVar6 = new a("ON_DESTROY", 5);
            ON_DESTROY = aVar6;
            a aVar7 = new a("ON_ANY", 6);
            ON_ANY = aVar7;
            $VALUES = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7};
            Companion = new C0236a();
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        @NotNull
        public final b b() {
            switch (b.a[ordinal()]) {
                case 1:
                case 2:
                    return b.g;
                case 3:
                case 4:
                    return b.h;
                case 5:
                    return b.i;
                case 6:
                    return b.d;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b d;
        public static final b e;
        public static final b g;
        public static final b h;
        public static final b i;
        public static final /* synthetic */ b[] j;

        static {
            b bVar = new b("DESTROYED", 0);
            d = bVar;
            b bVar2 = new b("INITIALIZED", 1);
            e = bVar2;
            b bVar3 = new b("CREATED", 2);
            g = bVar3;
            b bVar4 = new b("STARTED", 3);
            h = bVar4;
            b bVar5 = new b("RESUMED", 4);
            i = bVar5;
            j = new b[]{bVar, bVar2, bVar3, bVar4, bVar5};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) j.clone();
        }

        public final boolean b(@NotNull b state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return compareTo(state) >= 0;
        }
    }

    public abstract void a(@NotNull EP0 ep0);

    @NotNull
    public abstract b b();

    public abstract void c(@NotNull EP0 ep0);
}
