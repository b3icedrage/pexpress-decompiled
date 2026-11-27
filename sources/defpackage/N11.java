package defpackage;

import com.impl.core.backend.abstractModels.http.HttpPlatformResponse;

/* JADX INFO: loaded from: classes.dex */
public final class N11 extends KO1 {
    @Override // defpackage.KO1
    public final void m(IO1... io1Arr) {
        int i = 0;
        while (i < io1Arr.length) {
            IO1 io1 = io1Arr[i];
            i++;
            io1.j = i * HttpPlatformResponse.MAX_MESSAGE_LENGTH;
        }
    }

    @Override // defpackage.KO1
    public final IO1[] n() {
        return new IO1[]{new C2578Zk1(), new C2578Zk1(), new C2578Zk1()};
    }
}
