package defpackage;

import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ww1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7507ww1 extends C7576xG {

    @NotNull
    public final C6666sw1 d;

    @NotNull
    public final GP1 e;

    public C7507ww1(@NotNull C6666sw1 resourceProvider) {
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        this.d = resourceProvider;
        this.e = C1589Ne.i(C5653o60.d);
    }

    @Override // defpackage.C7576xG
    public final void j() {
        String string;
        C6666sw1 c6666sw1 = this.d;
        FF ff = (FF) c6666sw1.a.b.getValue();
        if (ff == null || (string = ff.H) == null) {
            string = c6666sw1.b.getString(R.string.support_mail_name);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        }
        this.e.setValue(WE.f(new C6456rw1(R.drawable.ic_footer_mail, R.string.fragment_main_robot_secrtion_footer_second_description, VE.c(string)), new C6456rw1(R.drawable.ic_footer_is_not, R.string.fragment_main_robot_secrtion_footer_third_description, WE.f(Integer.valueOf(R.string.app_name), Integer.valueOf(R.string.platform_name))), new C6456rw1(R.drawable.ic_footer_warning, R.string.we_neither_provide_text, C5653o60.d)));
    }
}
