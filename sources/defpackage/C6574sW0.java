package defpackage;

/* JADX INFO: renamed from: sW0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6574sW0<K, V> {
    public final a<K, V> a;
    public final V b;

    /* JADX INFO: renamed from: sW0$a */
    public static class a<K, V> {
        public final EnumC7044uj2.a a;
        public final EnumC7044uj2 b;
        public final V c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(EnumC7044uj2.a aVar, EnumC7044uj2 enumC7044uj2, Object obj) {
            this.a = aVar;
            this.b = enumC7044uj2;
            this.c = obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6574sW0(EnumC7044uj2.a aVar, EnumC7044uj2 enumC7044uj2, Object obj) {
        this.a = new a<>(aVar, enumC7044uj2, obj);
        this.b = obj;
    }

    public static <K, V> int a(a<K, V> aVar, K k, V v) {
        return C0649Bc0.b(aVar.b, 2, v) + C0649Bc0.b(aVar.a, 1, k);
    }
}
