package defpackage;

import androidx.fragment.app.s;
import com.appsflyer.internal.AFc1tSDK;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: sa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6585sa implements InterfaceC1014Fu, C7300vy.a, OnSuccessListener {
    public final /* synthetic */ Object d;

    public /* synthetic */ C6585sa(Object obj) {
        this.d = obj;
    }

    @Override // defpackage.C7300vy.a
    public void a() {
        s.b this$0 = (s.b) this.d;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a();
    }

    @Override // defpackage.InterfaceC1014Fu
    public void b(InterfaceC0858Du interfaceC0858Du) {
        C7215va c7215va = (C7215va) this.d;
        synchronized (c7215va) {
            try {
                if (c7215va.b instanceof T10) {
                    c7215va.c.add(interfaceC0858Du);
                }
                c7215va.b.b(interfaceC0858Du);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        AFc1tSDK.registerClient((AFc1tSDK) this.d, (AppSetIdInfo) obj);
    }
}
