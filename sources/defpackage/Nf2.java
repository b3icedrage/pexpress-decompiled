package defpackage;

import android.content.res.Resources;
import android.net.Uri;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.lang.reflect.InvocationHandler;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Nf2 implements WebMessageListenerBoundaryInterface, InterfaceC6867tt1, OnCompleteListener {
    public final Object d;

    public /* synthetic */ Nf2(Object obj) {
        this.d = obj;
    }

    @Override // defpackage.InterfaceC6867tt1
    public InterfaceC3667et1 a(@NonNull InterfaceC3667et1 interfaceC3667et1, @NonNull C4227ha1 c4227ha1) {
        if (interfaceC3667et1 == null) {
            return null;
        }
        return new C4190hO0((Resources) this.d, interfaceC3667et1);
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(@NotNull Task task) {
        Exception exception = task.getException();
        C6251qy c6251qy = (C6251qy) this.d;
        if (exception != null) {
            C1717Ot1.a aVar = C1717Ot1.e;
            c6251qy.resumeWith(C1795Pt1.a(exception));
        } else if (task.isCanceled()) {
            c6251qy.l(null);
        } else {
            C1717Ot1.a aVar2 = C1717Ot1.e;
            c6251qy.resumeWith(task.getResult());
        }
    }

    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z, InvocationHandler invocationHandler2) {
        AH0 ah0;
        WebMessageBoundaryInterface webMessageBoundaryInterface = (WebMessageBoundaryInterface) C8129zu.a(WebMessageBoundaryInterface.class, invocationHandler);
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        G1[] g1Arr = new G1[ports.length];
        for (int i = 0; i < ports.length; i++) {
            InvocationHandler invocationHandler3 = ports[i];
            Of2 of2 = new Of2();
            of2.e = (WebMessagePortBoundaryInterface) C8129zu.a(WebMessagePortBoundaryInterface.class, invocationHandler3);
            g1Arr[i] = of2;
        }
        if (Mh2.a.d()) {
            WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) C8129zu.a(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
            int type = webMessagePayloadBoundaryInterface.getType();
            ah0 = type != 0 ? type != 1 ? null : new AH0(webMessagePayloadBoundaryInterface.getAsArrayBuffer()) : new AH0(webMessagePayloadBoundaryInterface.getAsString());
        } else {
            ah0 = new AH0(webMessageBoundaryInterface.getData());
        }
        if (ah0 != null) {
            JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) C8129zu.a(JsReplyProxyBoundaryInterface.class, invocationHandler2);
            C5959pa2 c5959pa2 = (C5959pa2) this.d;
            c5959pa2.getClass();
            Intrinsics.checkNotNull(ah0);
            String string = uri.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            Hh2 hh2 = (Hh2) c5959pa2.d;
            hh2.getClass();
            int i2 = ah0.a;
            if (i2 != 0) {
                return;
            }
            if (i2 == 0) {
                String str = (String) ah0.b;
                if (str == null) {
                    return;
                }
                C5189lv.k(hh2.c.a, null, new Jh2(hh2, str, string, z, null), 3);
                return;
            }
            StringBuilder sb = new StringBuilder("Wrong data accessor type detected. ");
            sb.append(i2 != 0 ? i2 != 1 ? "Unknown" : "ArrayBuffer" : "String");
            sb.append(" expected, but got ");
            sb.append("String");
            throw new IllegalStateException(sb.toString());
        }
    }
}
