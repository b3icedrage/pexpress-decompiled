package defpackage;

import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;

/* JADX INFO: loaded from: classes.dex */
public final class Ul2 implements IntegrityManager {
    public final C3437dm2 a;

    public Ul2(C3437dm2 c3437dm2) {
        this.a = c3437dm2;
    }

    @Override // com.google.android.play.core.integrity.IntegrityManager
    public final Task<IntegrityTokenResponse> requestIntegrityToken(IntegrityTokenRequest integrityTokenRequest) {
        C3437dm2 c3437dm2 = this.a;
        Xl2 xl2 = c3437dm2.d;
        if (xl2 == null) {
            return Tasks.forException(new PB0(-2, null));
        }
        try {
            byte[] bArrDecode = Base64.decode(integrityTokenRequest.b(), 10);
            Long lA = integrityTokenRequest.a();
            if (integrityTokenRequest instanceof C4485im2) {
            }
            c3437dm2.a.a("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            xl2.a().post(new C8107zm2(xl2, taskCompletionSource, taskCompletionSource, new Zl2(c3437dm2, taskCompletionSource, bArrDecode, lA, taskCompletionSource, integrityTokenRequest)));
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e) {
            return Tasks.forException(new PB0(-13, e));
        }
    }
}
