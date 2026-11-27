package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: pf1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC5978pf1 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: pf1$a */
    public static final class a {
        public static final a d;
        public static final a e;
        public static final a g;
        public static final a h;
        public static final a i;
        public static final /* synthetic */ a[] j;

        static {
            a aVar = new a("Before", 0);
            d = aVar;
            a aVar2 = new a("Enrichment", 1);
            e = aVar2;
            a aVar3 = new a("Destination", 2);
            g = aVar3;
            a aVar4 = new a("Utility", 3);
            h = aVar4;
            a aVar5 = new a("Observe", 4);
            i = aVar5;
            j = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) j.clone();
        }
    }

    default void a(@NotNull C3595ea amplitude) {
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        e(amplitude);
    }

    void e(@NotNull C3595ea c3595ea);

    @Nullable
    default C0612Aq g(@NotNull C0612Aq event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return event;
    }

    @NotNull
    a getType();
}
