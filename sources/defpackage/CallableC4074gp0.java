package defpackage;

import java.net.InetAddress;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: gp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC4074gp0 implements Callable {
    @Override // java.util.concurrent.Callable
    public final Object call() {
        return InetAddress.getLocalHost();
    }
}
