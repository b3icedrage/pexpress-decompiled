package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: Df, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0813Df extends C2784ak0 implements Function0<Boolean> {
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        ConcurrentHashMap<InterfaceC0735Cf, XF0> concurrentHashMap = ((C1281Jf) this.e).f;
        boolean z = false;
        if (!concurrentHashMap.isEmpty()) {
            for (Map.Entry<InterfaceC0735Cf, XF0> entry : concurrentHashMap.entrySet()) {
                InterfaceC0735Cf key = entry.getKey();
                XF0 value = entry.getValue();
                if (value.isCancelled() || (key.c() && value.S0())) {
                    z = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
