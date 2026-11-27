package defpackage;

import java.util.HashMap;

/* JADX INFO: renamed from: iG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4376iG0 implements WO1 {
    public final Object d;
    public final Object e;

    public C4376iG0() {
        this.d = new HashMap();
        this.e = new HashMap();
    }

    @Override // defpackage.WO1
    public StackTraceElement[] b(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        WO1[] wo1Arr = (WO1[]) this.d;
        StackTraceElement[] stackTraceElementArrB = stackTraceElementArr;
        for (int i = 0; i < 1; i++) {
            WO1 wo1 = wo1Arr[i];
            if (stackTraceElementArrB.length <= 1024) {
                break;
            }
            stackTraceElementArrB = wo1.b(stackTraceElementArr);
        }
        return stackTraceElementArrB.length > 1024 ? ((C1589Ne) this.e).b(stackTraceElementArrB) : stackTraceElementArrB;
    }

    public C4376iG0(WO1... wo1Arr) {
        this.d = wo1Arr;
        this.e = new C1589Ne();
    }
}
