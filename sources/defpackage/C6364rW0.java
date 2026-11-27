package defpackage;

/* JADX INFO: renamed from: rW0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6364rW0<K, V> {
    public final a<K, V> a;

    /* JADX INFO: renamed from: rW0$a */
    public static class a<K, V> {
        public final EnumC6834tj2.a a;
        public final EnumC6834tj2.c b;
        public final C1364Kg1 c;

        public a(EnumC6834tj2.a aVar, EnumC6834tj2.c cVar, C1364Kg1 c1364Kg1) {
            this.a = aVar;
            this.b = cVar;
            this.c = c1364Kg1;
        }
    }

    public C6364rW0(EnumC6834tj2.a aVar, EnumC6834tj2.c cVar, C1364Kg1 c1364Kg1) {
        this.a = new a<>(aVar, cVar, c1364Kg1);
    }

    public static <K, V> int a(a<K, V> aVar, K k, V v) {
        return C0571Ac0.b(aVar.b, 2, v) + C0571Ac0.b(aVar.a, 1, k);
    }

    public static <K, V> void b(GE ge, a<K, V> aVar, K k, V v) {
        C0571Ac0.k(ge, aVar.a, 1, k);
        C0571Ac0.k(ge, aVar.b, 2, v);
    }
}
