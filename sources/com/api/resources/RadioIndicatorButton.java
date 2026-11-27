package com.api.resources;

import android.content.Context;
import android.util.AttributeSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/api/resources/RadioIndicatorButton;", "Lcom/api/resources/a;", "CommonResources_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RadioIndicatorButton extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadioIndicatorButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.api.resources.a, android.view.View
    public final boolean performClick() {
        if (this.z) {
            return false;
        }
        return super.performClick();
    }
}
