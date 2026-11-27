package com.impl.feature.profileandsettings.profile;

import android.os.Bundle;
import android.view.View;
import com.base.feature.profileandsettings.profile.screens.ProfileFragmentBase;
import defpackage.C3420di1;
import defpackage.WE;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/impl/feature/profileandsettings/profile/ProfileFragmentImpl;", "Lcom/base/feature/profileandsettings/profile/screens/ProfileFragmentBase;", "FeatureProfileAndSettingsImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProfileFragmentImpl extends ProfileFragmentBase {
    @Override // com.base.feature.profileandsettings.profile.screens.ProfileFragmentBase, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        C3420di1 c3420di1K = k();
        Iterator it = WE.f(c3420di1K.j.d, c3420di1K.k).iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(8);
        }
    }
}
