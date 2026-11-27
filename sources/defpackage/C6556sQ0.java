package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.View;
import androidx.annotation.NonNull;
import io.sentry.android.core.b0;

/* JADX INFO: renamed from: sQ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6556sQ0 extends URLSpan {
    public final C4685jX0 d;
    public final String e;
    public final C6346rQ0 g;

    public C6556sQ0(@NonNull C4685jX0 c4685jX0, @NonNull String str, @NonNull C6346rQ0 c6346rQ0) {
        super(str);
        this.d = c4685jX0;
        this.e = str;
        this.g = c6346rQ0;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.g.getClass();
        String str = this.e;
        Uri uriBuild = Uri.parse(str);
        if (TextUtils.isEmpty(uriBuild.getScheme())) {
            uriBuild = uriBuild.buildUpon().scheme("https").build();
        }
        Context context = view.getContext();
        Intent intent = new Intent("android.intent.action.VIEW", uriBuild);
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            b0.e("LinkResolverDef", "Actvity was not found for the link: '" + str + "'");
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(@NonNull TextPaint textPaint) {
        this.d.getClass();
        textPaint.setUnderlineText(true);
        textPaint.setColor(textPaint.linkColor);
    }
}
