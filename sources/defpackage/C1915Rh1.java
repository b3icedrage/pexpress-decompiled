package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.base.feature.profileandsettings.profile.screens.ProfileFragmentBase;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Rh1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1915Rh1 implements TextWatcher {
    public final /* synthetic */ ProfileFragmentBase d;

    public C1915Rh1(ProfileFragmentBase profileFragmentBase) {
        this.d = profileFragmentBase;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@Nullable Editable editable) {
        ProfileFragmentBase profileFragmentBase = this.d;
        if (profileFragmentBase.m) {
            profileFragmentBase.m = false;
        } else {
            C5189lv.k(C7652xe.f(profileFragmentBase), null, new C1837Qh1(profileFragmentBase, editable, null), 3);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }
}
