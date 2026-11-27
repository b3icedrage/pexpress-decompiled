package defpackage;

import android.animation.ValueAnimator;
import com.google.android.gms.auth.api.credentials.CredentialsApi;

/* JADX INFO: loaded from: classes.dex */
public final class X20 extends KO1 {

    public class a extends C5254mC {
        public a() {
            setAlpha(153);
            i(0.0f);
        }

        @Override // defpackage.IO1
        public final ValueAnimator f() {
            Float fValueOf = Float.valueOf(0.0f);
            float[] fArr = {0.0f, 0.5f, 1.0f};
            JO1 jo1 = new JO1(this);
            jo1.c(fArr, IO1.D, new Float[]{fValueOf, Float.valueOf(1.0f), fValueOf});
            jo1.c = 2000L;
            jo1.b(fArr);
            return jo1.a();
        }
    }

    @Override // defpackage.KO1
    public final void m(IO1... io1Arr) {
        io1Arr[1].j = CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
    }

    @Override // defpackage.KO1
    public final IO1[] n() {
        return new IO1[]{new a(), new a()};
    }
}
