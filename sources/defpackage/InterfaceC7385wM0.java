package defpackage;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: wM0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC7385wM0 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: wM0$a */
    public static final class a {
        public static final a d;
        public static final a e;
        public static final a g;
        public static final a h;
        public static final /* synthetic */ a[] i;

        static {
            a aVar = new a("TUTORIAL", 0);
            d = aVar;
            a aVar2 = new a("LAUNCH", 1);
            e = aVar2;
            a aVar3 = new a("PLATFORM", 2);
            g = aVar3;
            a aVar4 = new a("SETTINGS", 3);
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

    void a(@Nullable a aVar);

    @Nullable
    a b();
}
