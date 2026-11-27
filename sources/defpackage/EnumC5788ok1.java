package defpackage;

/* JADX INFO: renamed from: ok1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC5788ok1 implements YB0.a {
    /* JADX INFO: Fake field, exist only in values array */
    INTERNAL(0),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE(1),
    /* JADX INFO: Fake field, exist only in values array */
    PROTECTED(2),
    /* JADX INFO: Fake field, exist only in values array */
    PUBLIC(3),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE_TO_THIS(4),
    /* JADX INFO: Fake field, exist only in values array */
    LOCAL(5);

    public final int d;

    EnumC5788ok1(int i) {
        this.d = i;
    }

    @Override // YB0.a
    public final int getNumber() {
        return this.d;
    }
}
