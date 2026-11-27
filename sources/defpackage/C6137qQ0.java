package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: qQ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6137qQ0 {
    public StringBuilder d;
    public String e;
    public String f;
    public char g;
    public StringBuilder h;
    public a a = a.d;
    public final StringBuilder b = new StringBuilder();
    public final ArrayList c = new ArrayList();
    public boolean i = false;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: qQ0$a */
    public static final class a {
        public static final a d;
        public static final a e;
        public static final a g;
        public static final a h;
        public static final a i;
        public static final a j;
        public static final /* synthetic */ a[] k;

        static {
            a aVar = new a("START_DEFINITION", 0);
            d = aVar;
            a aVar2 = new a("LABEL", 1);
            e = aVar2;
            a aVar3 = new a("DESTINATION", 2);
            g = aVar3;
            a aVar4 = new a("START_TITLE", 3);
            h = aVar4;
            a aVar5 = new a("TITLE", 4);
            i = aVar5;
            a aVar6 = new a("PARAGRAPH", 5);
            j = aVar6;
            k = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) k.clone();
        }
    }

    public final void a() {
        if (this.i) {
            String strA = T70.a(this.f);
            StringBuilder sb = this.h;
            String strA2 = sb != null ? T70.a(sb.toString()) : null;
            ArrayList arrayList = this.c;
            String str = this.e;
            C5927pQ0 c5927pQ0 = new C5927pQ0();
            c5927pQ0.f = str;
            c5927pQ0.g = strA;
            c5927pQ0.h = strA2;
            arrayList.add(c5927pQ0);
            this.d = null;
            this.i = false;
            this.e = null;
            this.f = null;
            this.h = null;
        }
    }
}
