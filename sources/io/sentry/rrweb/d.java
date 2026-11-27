package io.sentry.rrweb;

import defpackage.BH0;
import defpackage.C6319rH0;
import defpackage.KG0;
import defpackage.Q71;
import defpackage.W71;
import io.sentry.ILogger;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d extends b {
    public a g;

    public enum a implements BH0 {
        Mutation,
        MouseMove,
        MouseInteraction,
        Scroll,
        ViewportResize,
        Input,
        TouchMove,
        MediaInteraction,
        StyleSheetRule,
        CanvasMutation,
        Font,
        Log,
        Drag,
        StyleDeclaration,
        Selection,
        AdoptedStyleSheet,
        CustomElement;

        /* JADX INFO: renamed from: io.sentry.rrweb.d$a$a, reason: collision with other inner class name */
        public static final class C0402a implements KG0<a> {
            @Override // defpackage.KG0
            @NotNull
            public final a a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
                return a.values()[q71.E0()];
            }
        }

        @Override // defpackage.BH0
        public void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
            ((C6319rH0) w71).f(ordinal());
        }
    }

    public d(@NotNull a aVar) {
        super(c.IncrementalSnapshot);
        this.g = aVar;
    }
}
