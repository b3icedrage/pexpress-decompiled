package defpackage;

import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.f;
import com.api.feature.analytics.reporters.ReporterApi;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class X21 implements f.a {
    public final /* synthetic */ BottomNavigationView d;

    public X21(BottomNavigationView bottomNavigationView) {
        this.d = bottomNavigationView;
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final boolean a(f fVar, @NonNull MenuItem menuItem) {
        EnumC1793Pt enumC1793Pt;
        C0667Bi0 c0667Bi0H;
        Y21.b bVar = this.d.i;
        if (bVar == null) {
            return false;
        }
        C7890yl c7890yl = (C7890yl) bVar;
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        EnumC1793Pt[] enumC1793PtArrValues = EnumC1793Pt.values();
        int length = enumC1793PtArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                enumC1793Pt = null;
                break;
            }
            enumC1793Pt = enumC1793PtArrValues[i];
            if (menuItem.getItemId() == enumC1793Pt.d) {
                break;
            }
            i++;
        }
        C1949Rt c1949Rt = (C1949Rt) c7890yl.d;
        boolean zBooleanValue = ((Boolean) c1949Rt.f.getValue()).booleanValue();
        InterfaceC3951gE1 interfaceC3951gE1 = c1949Rt.b;
        if (zBooleanValue && !Intrinsics.a(c1949Rt.h, interfaceC3951gE1.n()) && enumC1793Pt == EnumC1793Pt.Account) {
            ReporterApi.a.b(c1949Rt.e, EnumC5028l80.E0, null, null, 14);
        }
        int itemId = menuItem.getItemId();
        EnumC1793Pt enumC1793Pt2 = EnumC1793Pt.Platform;
        if (itemId == R.id.main_platform_fragment) {
            c0667Bi0H = interfaceC3951gE1.k();
        } else if (itemId == R.id.main_robot_fragment) {
            c0667Bi0H = interfaceC3951gE1.a();
        } else if (itemId == R.id.main_account_fragment) {
            c0667Bi0H = interfaceC3951gE1.n();
        } else {
            if (itemId != R.id.main_support_fragment) {
                throw new IllegalStateException("no such item in bottom navigation");
            }
            c0667Bi0H = interfaceC3951gE1.h();
        }
        c1949Rt.a.c(c0667Bi0H, false);
        return false;
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final void b(f fVar) {
    }
}
