package defpackage;

import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.widget.AppCompatEditText;
import io.sentry.android.core.b0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class BA0 implements MD1 {
    public final /* synthetic */ Object d;

    public /* synthetic */ BA0(Object obj) {
        this.d = obj;
    }

    public boolean a(EA0 ea0, int i, Bundle bundle) {
        TL.b aVar;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                ea0.a.b();
                Parcelable parcelable = (Parcelable) ea0.a.d();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                b0.f("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        ClipDescription description = ea0.a.getDescription();
        EA0.c cVar = ea0.a;
        ClipData clipData = new ClipData(description, new ClipData.Item(cVar.a()));
        if (i2 >= 31) {
            aVar = new TL.a(clipData, 2);
        } else {
            TL.c cVar2 = new TL.c();
            cVar2.a = clipData;
            cVar2.b = 2;
            aVar = cVar2;
        }
        aVar.a(cVar.c());
        aVar.setExtras(bundle);
        return Cd2.h((AppCompatEditText) this.d, aVar.build()) == null;
    }

    @Override // defpackage.MD1
    public void e(InterfaceC1015Fu0 scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        String str = (String) this.d;
        scope.m(WE.f("data-updater-target-missing", str));
        scope.b("data.updater", str);
        scope.h(NG1.WARNING);
    }
}
