package defpackage;

import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: bU0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC2950bU0 implements Callable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ CallableC2950bU0(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        Object obj = this.g;
        Object obj2 = this.e;
        switch (this.d) {
            case 0:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) obj2;
                String str = (String) obj;
                if (!lottieAnimationView.q) {
                    return C5729oU0.b(lottieAnimationView.getContext(), str, null);
                }
                Context context = lottieAnimationView.getContext();
                HashMap map = C5729oU0.a;
                return C5729oU0.b(context, str, "asset_" + str);
            default:
                InterfaceC1560Mu0 interfaceC1560Mu0 = (InterfaceC1560Mu0) obj2;
                VF1 vf1 = (VF1) obj;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, CG1.d));
                    try {
                        interfaceC1560Mu0.b(vf1, bufferedWriter);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        return byteArray;
                    } catch (Throwable th) {
                        try {
                            bufferedWriter.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        byteArrayOutputStream.close();
                        break;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
        }
    }
}
