package defpackage;

import com.appsflyer.internal.AFc1jSDK;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.b;

/* JADX INFO: renamed from: oA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5668oA implements Function0 {
    public final /* synthetic */ int d;

    public /* synthetic */ C5668oA(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                C4814k70 c4814k70 = b.k;
                int iA = OW0.a(XE.m(c4814k70, 10));
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                for (Object obj : c4814k70) {
                    linkedHashMap.put(Integer.valueOf(((b) obj).d), obj);
                }
                return linkedHashMap;
            case 1:
                return new B30(true);
            case 2:
                return Unit.a;
            default:
                return AFc1jSDK.registerClient();
        }
    }
}
