package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: i02, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4320i02 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: i02$a */
    public static final class a {
        public static final a d;
        public static final a e;
        public static final a g;
        public static final /* synthetic */ a[] h;

        static {
            a aVar = new a("LITERAL_STATE", 0);
            d = aVar;
            a aVar2 = new a("START_STATE", 1);
            e = aVar2;
            a aVar3 = new a("DEFAULT_VAL_STATE", 2);
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

    public static void a(ArrayList arrayList, StringBuilder sb) {
        if (sb.length() == 0) {
            return;
        }
        arrayList.add(new C3271d02(C3271d02.a.d, sb.toString()));
    }
}
