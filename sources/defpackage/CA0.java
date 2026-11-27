package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class CA0 extends InputConnectionWrapper {
    public final /* synthetic */ BA0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CA0(InputConnection inputConnection, BA0 ba0) {
        super(inputConnection, false);
        this.a = ba0;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        EA0 ea0 = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            ea0 = new EA0(new EA0.a(inputContentInfo));
        }
        if (this.a.a(ea0, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
