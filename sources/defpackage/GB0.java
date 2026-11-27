package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class GB0 implements InterfaceC5362mj<int[]> {
    @Override // defpackage.InterfaceC5362mj
    public final String a() {
        return "IntegerArrayPool";
    }

    @Override // defpackage.InterfaceC5362mj
    public final int b() {
        return 4;
    }

    @Override // defpackage.InterfaceC5362mj
    public final int c(int[] iArr) {
        return iArr.length;
    }

    @Override // defpackage.InterfaceC5362mj
    public final int[] newArray(int i) {
        return new int[i];
    }
}
