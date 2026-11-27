package defpackage;

/* JADX INFO: renamed from: lS0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5090lS0 {
    public final long a;
    public final a b;

    /* JADX INFO: renamed from: lS0$a */
    public enum a implements InterfaceC6837tk1 {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);

        public final int d;

        a(int i) {
            this.d = i;
        }

        @Override // defpackage.InterfaceC6837tk1
        public final int getNumber() {
            return this.d;
        }
    }

    public C5090lS0(long j, a aVar) {
        this.a = j;
        this.b = aVar;
    }
}
