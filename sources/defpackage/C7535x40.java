package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.base.feature.registration.screens.duoauth.DuoAuthFragmentBase;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: x40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7535x40 implements TextWatcher {
    public final /* synthetic */ DuoAuthFragmentBase d;

    public C7535x40(DuoAuthFragmentBase duoAuthFragmentBase) {
        this.d = duoAuthFragmentBase;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@Nullable Editable editable) {
        Object obj = this.d.i;
        Intrinsics.checkNotNull(obj);
        K40 k40 = (K40) obj;
        String newText = String.valueOf(editable);
        k40.getClass();
        Intrinsics.checkNotNullParameter(newText, "newText");
        GP1 gp1 = k40.f;
        gp1.getClass();
        gp1.m(null, newText);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }
}
