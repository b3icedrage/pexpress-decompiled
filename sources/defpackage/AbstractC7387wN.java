package defpackage;

/* JADX INFO: renamed from: wN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7387wN {
    public static final C5151lj1<a> a = new C5151lj1<>("list-item-type");
    public static final C5151lj1<Integer> b = new C5151lj1<>("bullet-list-item-level");
    public static final C5151lj1<Integer> c = new C5151lj1<>("ordered-list-item-number");
    public static final C5151lj1<Integer> d = new C5151lj1<>("heading-level");
    public static final C5151lj1<String> e = new C5151lj1<>("link-destination");
    public static final C5151lj1<Boolean> f = new C5151lj1<>("paragraph-is-in-tight-list");
    public static final C5151lj1<String> g = new C5151lj1<>("code-block-info");

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: wN$a */
    public static final class a {
        public static final a d;
        public static final a e;
        public static final /* synthetic */ a[] g;

        static {
            a aVar = new a("BULLET", 0);
            d = aVar;
            a aVar2 = new a("ORDERED", 1);
            e = aVar2;
            g = new a[]{aVar, aVar2};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) g.clone();
        }
    }
}
