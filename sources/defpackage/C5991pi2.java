package defpackage;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: pi2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.utils.WebViewScriptsManager$loadScript$2", f = "WebViewScriptsManager.kt", l = {}, m = "invokeSuspend")
public final class C5991pi2 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public final /* synthetic */ C6201qi2 d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5991pi2(C6201qi2 c6201qi2, String str, JM jm) {
        super(2, jm);
        this.d = c6201qi2;
        this.e = str;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C5991pi2(this.d, this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C5991pi2) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        String strJ;
        MN mn = MN.d;
        C1795Pt1.b(obj);
        C6201qi2 c6201qi2 = this.d;
        LinkedHashMap linkedHashMap = c6201qi2.a;
        String str = this.e;
        if (linkedHashMap.containsKey(str)) {
            return Unit.a;
        }
        try {
            InputStream inputStreamOpenStream = FirebasePerfUrlConnection.openStream(new URL(str));
            try {
                Intrinsics.checkNotNull(inputStreamOpenStream);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenStream, Charsets.UTF_8), 8192);
                try {
                    strJ = CollectionsKt.J(C0648Bc.m(bufferedReader), "\n", null, null, null, 62);
                    bufferedReader.close();
                    C6621sj.b(inputStreamOpenStream, null);
                    c6201qi2.a.put(str, strJ);
                    return Unit.a;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        C6621sj.b(bufferedReader, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    C6621sj.b(inputStreamOpenStream, th3);
                    throw th4;
                }
            }
        } catch (Exception unused) {
            strJ = "";
        }
    }
}
