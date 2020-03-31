function verificar(xhr, status, args, dld, tb) {
        if(args.validationFailed) {
            PF(dlg).jq.effect("shake", {times:5}, 100);
        }
        else {
            PF(dlg).hide();
            PF(dlg).clearFilters();

            $('#loginLink').fadeOut();
        }
    }