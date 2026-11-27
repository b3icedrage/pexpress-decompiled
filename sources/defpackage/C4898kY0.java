package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.jivosite.sdk.ui.imageviewer.ImageViewerActivity;
import defpackage.AbstractC1075Go0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kY0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C4898kY0<T extends AbstractC1075Go0> extends EZ0<T> {

    @NotNull
    public final C5108lY0<T> v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4898kY0(@NotNull View itemView, @NotNull C5108lY0<T> viewModel) {
        super(itemView, viewModel);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.v = viewModel;
    }

    public final void s() {
        AbstractC4688jY0 abstractC4688jY0 = (AbstractC4688jY0) this.v.l.d();
        if (abstractC4688jY0 instanceof AbstractC4688jY0.e) {
            C4220hY0 c4220hY0 = ((AbstractC4688jY0.e) abstractC4688jY0).a;
            U0.h(r(), c4220hY0.b, c4220hY0.a);
        }
    }

    public final void t() {
        AbstractC4688jY0 abstractC4688jY0 = (AbstractC4688jY0) this.v.l.d();
        if (abstractC4688jY0 instanceof AbstractC4688jY0.e) {
            C4220hY0 c4220hY0 = ((AbstractC4688jY0.e) abstractC4688jY0).a;
            Context context = r();
            String path = c4220hY0.b;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(path, "path");
            String name = c4220hY0.a;
            Intrinsics.checkNotNullParameter(name, "name");
            int i = ImageViewerActivity.g;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(name, "name");
            Intent intent = new Intent(context, (Class<?>) ImageViewerActivity.class);
            intent.putExtra("path", path);
            intent.putExtra(AppMeasurementSdk.ConditionalUserProperty.NAME, name);
            context.startActivity(intent);
        }
    }
}
